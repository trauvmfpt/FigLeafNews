function convertDateTime(value){
    var date = new Date(Date.parse(value));
    return (date.getDate()) + "/" + (date.getMonth() + 1) + "/" + date.getFullYear() ;
}

function generateTextEditor(){
    var editor = new Simditor({
        textarea: $('#editor'),
        toolbar:
            [
                'title',
                'bold',
                'italic',
                'underline',
                'strikethrough',
                'fontScale',
                'color',
                'ol',
                'ul' ,
                'blockquote',
                'code'  ,
                'table',
                'link',
                'image',
                'hr'    ,
                'indent',
                'outdent',
                'alignment',
            ]
    });
}

$(document).ready(function () {
    $("input").prop('required',true);
    $("select").prop('required',true);
});

$(".reset").click(function() {
    $(this).closest('form').find("input[type=text], textarea").val("");
    $(".simditor-body").html("");
    $(".preview_images").addClass("hidden");
});

$(".input-form").validate({

    invalidHandler: function(event, validator) {
        // 'this' refers to the form
        var errors = validator.numberOfInvalids();
        if (errors) {
            var message = errors == 1
                ? 'You missed 1 field. It has been highlighted'
                : 'You missed ' + errors + ' fields. They have been highlighted';
            $("div.error span").html(message);
            $("div.error").show();
        } else {
            $("div.error").hide();
        }
    }
});