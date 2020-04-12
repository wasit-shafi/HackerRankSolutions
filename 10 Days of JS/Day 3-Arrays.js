'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}
function getSecondLargest(nums)
{
    // Time complexity O(N)
    let largest = nums[0];
    for(let i = 1 ; i < nums.length ; i++)
    {
        if(nums[i] > largest)
        {
            largest = nums[i]
        }
    }

    let secondLargest = Number.MIN_VALUE;
    for(let i = 0 ; i < nums.length ; i++)
    {
        if(nums[i] < largest && nums[i] > secondLargest)
        {
            secondLargest = nums[i];
        }
    }
    return secondLargest;
}

function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}