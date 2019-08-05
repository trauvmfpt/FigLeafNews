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