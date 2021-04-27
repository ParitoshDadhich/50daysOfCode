const red = document.querySelector(".red");
const cyan = document.querySelector(".cyan");
const violet = document.querySelector(".violet");
const orange = document.querySelector(".orange");
const pink = document.querySelector(".pink");

const center = document.querySelector(".center");

// console.log(window.getComputedStyle(red).backgroundColor);

const getBGColor = (selectedElement) => {
    return window.getComputedStyle(selectedElement).backgroundColor;
}

// var color = getBGColor(orange);

// orange.addEventListener('what event you are looking for', 'what you really want to do')
// orange.addEventListener('mouseenter', () =>{
//     center.style.backgroundColor = color; 
// });

// color = getBGColor(pink);

// pink.addEventListener('mouseeneter', () =>{
//     center.style.backgroundColor = color;
// });


const magicColorChanger = (element, color) => {
    return element.addEventListener('mouseenter', () => {
        center.style.backgroundColor = color;
    });
}

magicColorChanger(red, getBGColor(red));
magicColorChanger(cyan, getBGColor(cyan));
magicColorChanger(violet, getBGColor(violet));
magicColorChanger(orange, getBGColor(orange));
magicColorChanger(pink, getBGColor(pink));
