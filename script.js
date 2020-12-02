let btn = document.getElementById('btn');
let output = document.getElementById('outputtext');

let number = Math.floor(Math.random()*100)
function check () {
    let input = parseInt (document.getElementById('userInput').value);

    console.log(input,number)
    
    if (input > number) {
        output.innerHTML = " Your guess is too high ";
    }
    else if (input < number) {
        output.innerHTML = " Your guess is too low ";
    }
    else {
        output.innerHTML = " Congratulations! " ;
        btn.removeEventListener("click", check)

    }

}
btn.addEventListener("click", check)
    