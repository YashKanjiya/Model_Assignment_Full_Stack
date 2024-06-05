var data=function cool(){
    return "Hello yash";
}

console.log(data);

var yash=(res,req)=>{
    console.log("this is forst"+res+"this is second"+req);
}

yash(5,10);

var obj={
    key:"yash",
    value:"tata"
}

console.log(obj.key);


function sumofthreenumer(...args){
    return new Promise((resolve,reject)=>{
        if(args.length>3){
            reject("kdjsksfjskf")
        }
        else{
            let sum=0;
            let i=0;
            while(i<args.length){
                sum+=args[i];
                i++;
            }
            resolve("sum is good "+sum);
        }
    })
}

const use=sumofthreenumer([5,10,15]);
console.log(use);

sumofthreenumer(4,5,6)
.then(result => console.log(result))
.catch(result => console.log(result))



// function randomFunc(){
//   for(let i = 0; i < 2; i++){
//     setTimeout(()=> console.log(i),1000);
//   }
// }
// randomFunc(); 

// function randomFunc1(){
//   for(var i = 0; i < 2; i++){
//     (function(i){
//         setTimeout(()=> console.log(i),1000);
//     })(i);
//   }
// }
// randomFunc1(); 

function randomFunc(){
  for(var i = 0; i < 2; i++){
  (function(i){
      setTimeout(()=>console.log(i),1000);
    })(i);
  }
}
randomFunc();
