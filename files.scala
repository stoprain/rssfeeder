//> using dep com.lihaoyi::os-lib:0.10.2

def filesByExtension(
  extension: String,
  dir: os.Path = os.pwd): Seq[os.Path] =
    os.walk(dir).filter { f =>
      f.last.endsWith(s".$extension") && os.isFile(f)
    }