
(function() {
    $('form > input').keyup(function() {

        var empty = false;
        $('form > input').each(function() {
            if ($(this).val() === '') {
                empty = true;
            }
        });

        if (empty) {
            $('#buscar').attr('disabled', 'disabled'); 
        } else {
            $('#buscar').removeAttr('disabled'); 
        }
    });
})()
