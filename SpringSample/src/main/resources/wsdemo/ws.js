var url = "http://localhost:8090/marco";

var sock = new SockJS(url);

sock.onopen = function(){
	console.log("opening");
	sayMarco();
};

sock.onmessage = function(e){
	console.log("Receive message: " , e.data);
	setTimeout(function(){sayMarco()},2000);
};

sock.onclose = function(){
	console.log("Closing");
};

function sayMarco(){
	console.log("Sending marco!");
	sock.send("Marco");
}
