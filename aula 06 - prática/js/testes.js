function a(callback){
    setTimeout(function(){
        console.log('função A');
        callback();
    }, 3000);
}

function b(){
    console.log('função B')
}

// a(b);

for (let i = 0; i <= 10; i++) {
    setTimeout(function(){
        console.log(`número ${i}`);
    },1000)    
}