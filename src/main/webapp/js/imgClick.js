var imgArr = [
    {
        id: 1,
        src: '../img/杯子/1.jpg',
    },
    {
        id: 2,
        src: '../img/杯子/2.jpg',
    },
    {
        id: 3,
        src: '../img/杯子/3.jpg',
    },
    {
        id: 4,
        src: '../img/杯子/4.jpg',
    },
    {
        id: 5,
        src: '../img/杯子/5.jpg',
    },
]
var currentId = 1

function imgClick(e) {
    currentId = e.target.id.split('').pop()
    return currentId
}
