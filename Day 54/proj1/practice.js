var counter = document.getElementsByTagName("h1")[0];
var follower = document.getElementsByTagName("p")[0];

var count = 1;

setInterval(() => {
    if(count < 1000){
        count ++;
        counter.innerText = count;
    }
}, 1);

setTimeout(() => {
    follower.innerText = "Followers in Instagram"
}, 5000)
