/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if (x < 0){
        return false;
    }

    if (x / 10 == 0){
        return true;
    }

    var digits = new Array();

    while(x > 0){
        var digit = x % 10;
        digits.push(digit);
        x -= digit;
        x /= 10;
    }

    var leftIndex = 0;
    var rightIndex = digits.length - 1;

    while (leftIndex < rightIndex){
        if (digits[leftIndex] == digits[rightIndex]){
            leftIndex++;
            rightIndex--;
        } else {
            return false;
        }
    }
    return true;
};
