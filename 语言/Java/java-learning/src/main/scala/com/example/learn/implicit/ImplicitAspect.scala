package com.example.learn.`implicit`

import java.io.File

import com.example.learn.`implicit`.ImplicitApp.Man
import com.example.learn.`implicit`.ImplicitExamplle002.{RichFile, Superman}

object ImplicitAspect {

  implicit def man2superman(man:Man):Superman = new Superman(man.name)

  implicit def file2RichFile(file:File):RichFile = new RichFile(file)

}


