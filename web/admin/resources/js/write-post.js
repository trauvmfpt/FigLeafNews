generateTextEditor();

$(".btn-submit").click(function (){
    if($("#createPostForm")[0].checkValidity()) {
        var formData = {
            "Title" : $("#createPostForm").find('input[name="title"]').val(),
            "Description" : $("#createPostForm").find('textarea[name="description"]').val(),
            "Content" : $(".simditor-body")[0].innerHTML,
            "ImageUrl" : $("#createPostForm").find('input[name="image"]').val(),
        };
        $.ajax({
            type: 'POST',
            accepts: 'application/json',
            contentType: 'application/json',
            url: API_CreatePost,
            headers: {
                "Authorization": Cookies.get("token"),
                "Role": Cookies.get("loggedUserRole"),
            },
            data: JSON.stringify(formData),
            success: function (result) {
                swal("Create New Post Successful");
            },
            error: function (xhr, textStatus, errorThrown) {
            }
        });
    }
    else {
        $("#createPostForm")[0].reportValidity();
    }
});