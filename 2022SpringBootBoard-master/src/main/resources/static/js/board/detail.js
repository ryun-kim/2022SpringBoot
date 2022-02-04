(function (){
    'use strict';

    const searchParams = new URL(window.location.href).searchParams;
    const iboard = searchParams.get('iboard');

    const boardDetailElem = document.querySelector('#board_detail');

    const commentFormContainerElem = document.querySelector('#comment_form_container');
    const commentSubmitBtnElem = commentFormContainerElem.querySelector('button[name]');

    const getData = () =>{
        fetch(`/board/detail_list`)
    }
})