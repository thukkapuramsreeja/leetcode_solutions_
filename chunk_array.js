/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */


var chunk = function(arr, size) {

    let result = []; // final answer (store chunks)

    // loop through array
    for (let i = 0; i < arr.length; i += size) {

        let temp = []; // store one small chunk

        // take 'size' elements
        for (let j = i; j < i + size && j < arr.length; j++) {
            temp.push(arr[j]); // add element to chunk
        }

        result.push(temp); // add chunk to result
    }

    return result; // return all chunks
};


/*We take elements in groups of size k.
Store them in a temporary array and add to result.
Repeat until array ends.*/