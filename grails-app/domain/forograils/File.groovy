package forograils

class File {

    String fileType
    Byte[] content
    Double size

    static constraints = {
        content(maxSize: 10000000)
        fileType()//TODO: verificarse que tenga al menos un “/” y mínimo un caracter antes y un caracter después de dicho símbolo

    }
}
