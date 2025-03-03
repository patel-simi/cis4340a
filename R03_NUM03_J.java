public static log getInteger(DataInputStream is) throws IOException {
  return is.readInt() &0xFFFFFFFFL; //Mask with 32 one-bits
}
