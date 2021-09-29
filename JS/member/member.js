function idcheck() {
    if (document.formm.id.value == ""){
        alert('아이디를 입력하여 주십시오.');
        document.formm.id.focus();
    }else {
        var url = "NonageServlet?command=id_check_form&id="
            + document.formm.id.value;
        window.open(url, "_blank_1",
        "toolbar = no, menubar=no, scrollbars=yes,resizable=no, width=400, height=200");
    }
}