/*
 * Copyright 2018 Albert Tregnaghi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 */
package de.jcup.asciidoctoreditor;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class AsciiDocFileUtilsTest {

    @Test
    public void test() {
       /* prepare */
       File file = new File("./");
       File asciiDocFile = new File(file,"basefolder/sub1/sub2/sub3/test.adoc");
       File baseDir = new File(file,"basefolder");
       
       /* execute */
       String path = AsciiDocFileUtils.calculatePathToFileFromBase(asciiDocFile, baseDir);
    
       /* test */
       assertEquals("sub1/sub2/sub3/test.adoc",path);
    }

}
