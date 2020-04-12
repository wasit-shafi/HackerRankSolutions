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

function vowelsAndConsonants(s)
{
    var vowels = '';
    var consonants = '';

    for( var i = 0 ; i < s.length ; i++)
    {
        if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
            vowels += s[i] + '\n'; 
        else
            consonants += s[i] + '\n';
    }
    console.log(vowels.substr(0, vowels.length-1));
    console.log(consonants.substr(0, consonants.length -1));
}

function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}