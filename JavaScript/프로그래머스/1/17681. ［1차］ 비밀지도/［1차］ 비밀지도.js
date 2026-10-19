function solution(n, arr1, arr2) {
    // 비트 연산
    // 2진수
    var answer = [];
    
    for (let i = 0; i < n; i++) {
        // 2진수로 변환
        const bin = (arr1[i] | arr2[i]).toString(2);
        let arr = [];
        
        for (let j = bin.length - n; j < bin.length; j++) {
            if(bin[j] === '1') {
                arr.push('#');
            } else {
                arr.push(' ');
            }
        }
        
        answer.push(arr.join(''))
    }
    return answer;
}