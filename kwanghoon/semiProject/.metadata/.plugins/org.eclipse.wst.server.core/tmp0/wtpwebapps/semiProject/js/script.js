function check_ok(){
	// 문서에서.form이름.id이름.value값이.=="" => 없으면 return
	// return 대신에 focus를 사용할 수 있다.
	// if(document.reg_frm.mem_uid.value == ""){
	// (document를 생략해도 됨).length를 사용해서 == 0 이면, return;
	if(reg_frm.user_id.value.length == 0){
		alert("아이디를 써주세요.");
		// reg_frm.mem_uid.value로 focus 이동
		reg_frm.user_id.focus();
		return;
	}
	
	if(reg_frm.user_id.value.length < 4){
		alert("아이디는 4글자 이상이어야 합니다.");
		// reg_frm.mem_uid.value로 focus 이동
		reg_frm.user_id.focus();
		return;
	}
	
	if(document.reg_frm.user_pwd.value.length == 0){
		alert("패스워드는 반드시 입력해야 합니다.");
		reg_frm.user_pwd.focus();
		return;
	}
	
	if(reg_frm.user_pwd.value != reg_frm.pwd_check.value){
		alert("패스워드가 일치하지 않습니다.");
		reg_frm.pwd_check.focus();
		return;
	}
	
	if(reg_frm.user_name.value.length == 0){
		alert("이름을 써주세요.");
		reg_frm.user_name.focus();
		return;
	}
	
	if(reg_frm.user_email.value.length == 0){
		alert("E-Mail을 써주세요.");
		reg_frm.user_email.focus();
		return;
	}
	// 만약에 있다면
	// 문서.form.submit
	reg_frm.submit();
}