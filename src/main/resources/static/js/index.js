$(document).ready(function () {
    $('#regBtn').click(function () {    // 등록 페이지 이동 버튼
        window.location.href = '/write';
    });

    $('#cancel').click(function () { // 취소 버튼 (index)
        window.location.href = "/";
    });

    $('#updateBtn').click(function () { // 업데이트 페이지 이동 버튼
        var bno = $('#bno').val();
        window.location.href = "/update/"+bno;
    });

    $('#updateCancel').click(function () { // 업데이트 페이지 이동 버튼
        var bno = $('#bno').val();
        window.location.href = "/select/"+bno;
    });

    $('#insert').click(function () {    // 글 등록 버튼
        var data = {
            title : $('#title').val(),
            content : $('#content').val(),
            writer : $('#writer').val()
        };
        $.ajax({
            type : 'POST',
            url : '/rest/write',
            data : data
        }).done(function () {
            alert('글등록 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#update').click(function () {    // 글 수정 버튼
        var bno = $('#updateBno').val();
        var data = {
            content : $('#content').val(),
            bno : $('#updateBno').val()
        }

        $.ajax({
            type : 'PUT',
            url : '/rest/update',
            data : data
        }).done(function () {
            alert('글 수정 완료');
            window.location.href="/select/"+bno;
        }).fail(function (error) {
            alert(error);
        })
    });

    $('#delete').click(function () {    // 글 삭제 버튼
        var data = {
            bno : $('#updateBno').val()
        }
        $.ajax({
            type : 'DELETE',
            url : '/rest/delete',
            data : data
        }).done(function () {
            alert('글 삭제 완료');
            window.location.href="/";
        }).fail(function (error) {
            alert(error);
        })
    });

    $('#insertReply').click(function () {   // 댓글 등록 버튼
        var bno = $('#bno').val();
        var data = {
            bno : $('#bno').val(),
            rwriter : $('#rwriter').val(),
            rcontent : $('#rcontent').val()
        };

        $.ajax({
            type : 'POST',
            url : '/rest/reply/insert',
            data : data
        }).done(function () {
            window.location.href="/select/"+bno;
        }).fail(function (error) {
            alert(error);
        })
    })
});