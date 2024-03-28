fun littleEndianHexToFloat(hex: String): Float {
    // Reverse the order of the bytes
    val reversedHex = hex.chunked(2).reversed().joinToString("")

    // Parse the hexadecimal string as an integer
    // Use the integer value with Float.fromBits()
    return Float.fromBits(reversedHex.toLong(16).toInt())
}

fun littleEndianHexToLong(hex: String): Int {
    // Reverse the order of the bytes
    val reversedHex = hex.chunked(2).reversed().joinToString("")

    // Parse the hexadecimal string as an integer
    return reversedHex.toLong(16).toInt()
}

fun main() {

    //3018,0.82,-1.79,-0.56,54.38,-4.82,6.59,-28.48,-58.79,13.01
//CA0B0000 0028513F 0018E5BF 00C80EBF 80875942 004C9AC0 00F0D240 00D5E3C1 00286BC2 00345041

//4530,0.82,-1.80,-0.55,58.84,-0.55,9.09,-28.71,-58.20,12.55
//B2110000 00B0523F 00F8E5BF 00200CBF 005A6B42 00A00CBF 00821141 00B0E5C1 00D068C2 00C84841

//6042,0.82,-1.79,-0.55,53.59,-4.09,7.39,-27.94,-58.50,12.57
//9A170000 0028523F 000CE5BF 00000EBF 005B5642 00DC82C0 0054EC40 0089DFC1 00FC69C2 002C4941

//7554,0.86,-1.78,-0.47,55.24,0.12,4.70,-28.61,-57.89,13.92
//821D0000 00F05B3F 0028E4BF 0040F0BE 80F25C42 0000FA3D 00649640 00E8E4C1 008B67C2 00A85E41



    println(littleEndianHexToFloat("00F05B3F"))
    println(littleEndianHexToFloat("0028E4BF"))
    println(littleEndianHexToFloat("0040F0BE"))
    println("-----------------------------------")
    println(littleEndianHexToLong("B2110000"))
    println(littleEndianHexToLong("9A170000"))
    println(littleEndianHexToLong("821D0000"))
}
