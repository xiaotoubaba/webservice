$(function() {
	box_centent();
})
function box_centent() {
	var width = $("#box").width();
	var height = $("#box").height();
	var windowWidth = $(window).width();
	var windowHeight = $(window).height();
	var left = windowWidth / 2 - width / 2;
	var top = windowHeight / 2 - height / 2;
	$("#box").css({
		left : left,
		top : top
	});
}

function sendMsg() {
	var phone = $("#phone").val();
	if (phone == "" || phone == null) {
		alert("不能为空");
		$("#phone").focus();
		return;
	}
	if (phone.length != 11) {
		alert("不是正确的号码格式");
		$("#phone").select();
		$("#phone").focus();
		return;
	}
	var kd = document.getElementById("dropdown_select").value;
	send(phone,kd);
}

function send(phone,kd) {
	$.ajax({
		url : "SendMsg",
		type : "get",
		data : {
			"Phone" : phone,
			"kd":kd
		},
		success : function(data) {
			var data2 = data.trim();
			if (data2 == "发送失败") {
				alert("发送失败");
			} else if (data2 == "发送成功") {
				sava_sendNumber(phone,kd);
			}
		}
	});
}
function sava_sendNumber(phone,kd){
	var xmlhttp;
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			document.getElementById("panel-body_info").innerHTML = xmlhttp.responseText;
		}
	}
	xmlhttp.open("get", "SavaSendNumber?phone=" + phone+"&&kd="+kd, true);
	xmlhttp.send();
}

function sendjsp(){
	window.location.href="Body.jsp";
}
function customer_order(){
	var xmlhttp;
	if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
		xmlhttp = new XMLHttpRequest();
	} else {// code for IE6, IE5
		xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			document.getElementById("panel-body_m").innerHTML = xmlhttp.responseText;
		}
	}
	xmlhttp.open("get", "Information.jsp", true);
	xmlhttp.send();
}

function exit(){
	window.location.href = "Login.jsp";
}
function sf()
{
	document.getElementById("dropdown_select").innerHTML = "顺丰快递"+"<span class='caret'></span>";
	document.getElementById("dropdown_select").value = "顺丰快递";
	var x = document.getElementById("dropdown_select").value;
}
function bs(){
	document.getElementById("dropdown_select").innerHTML = "百世汇通"+"<span class='caret'></span>";
	document.getElementById("dropdown_select").value = "百世汇通";
	var x = document.getElementById("dropdown_select").value;
}
function ems(){
	document.getElementById("dropdown_select").innerHTML = "EMS"+"<span class='caret'></span>";
	document.getElementById("dropdown_select").value = "EMS";
	var x = document.getElementById("dropdown_select").value;
}
function st(){
	document.getElementById("dropdown_select").innerHTML = "申通快递"+"<span class='caret'></span>";
	document.getElementById("dropdown_select").value = "申通快递";
	var x = document.getElementById("dropdown_select").value;
}
function tt(){
	document.getElementById("dropdown_select").innerHTML = "天天快递"+"<span class='caret'></span>";
	document.getElementById("dropdown_select").value = "天天快递";
	var x = document.getElementById("dropdown_select").value;
}
function yd(){
	document.getElementById("dropdown_select").innerHTML = "韵达快递"+"<span class='caret'></span>";
	document.getElementById("dropdown_select").value = "韵达快递";
	var x = document.getElementById("dropdown_select").value;
}
function yt(){
	document.getElementById("dropdown_select").innerHTML = "圆通速递"+"<span class='caret'></span>";
	document.getElementById("dropdown_select").value = "圆通速递";
	var x = document.getElementById("dropdown_select").value;
}