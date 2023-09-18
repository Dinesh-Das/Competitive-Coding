/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function(rowIndex) {
    var outputArray = [];
    for(var i = 0 ; i<= rowIndex; i++) { 
        var temp = [] ;
        for(var j = 0; j <= i ; j++ ){ 
            if( j == 0 || j == i)
                temp.push(1);
            else{
                temp.push( outputArray.at(j) + outputArray.at(j-1));
            }
        }
        outputArray = temp;
    }
    return outputArray;
};