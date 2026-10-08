public class Bandage {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int castTime = bandage[0]; // 연속 시전 시간 (t)
        int healPerSec = bandage[1]; // 초당 회복량 (x)
        int bonusHeal = bandage[2]; // 시전 후 추가 회복량 (y)

        int maxHealth = health;
        int currentHealth = health;
        int lastAttackTime = 0;

        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            // 1. 이전 공격 시점부터 이번 공격 직전까지 없으면 연속으로 붕대 감은 시간
            int duration = attackTime - lastAttackTime - 1;

            if (duration > 0) {
                // 기본 회복량 + 연속 시전 성공 횟수(duration / castTime)에 따른 추가 회복량
                int totalHeal = (duration * healPerSec) + ((duration / castTime) * bonusHeal);
                currentHealth = Math.min(maxHealth, currentHealth + totalHeal);
            }

            // 2. 몬스터 공격 적용
            currentHealth -= damage;

            // 3. 사망 여부 확인
            if (currentHealth <= 0) {
                return -1;
            }

            // 4. 마지막 공격 시점 업데이트
            lastAttackTime = attackTime;
        }

        return currentHealth;
    }
}
