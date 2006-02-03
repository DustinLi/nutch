/**
 * Copyright 2005 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nutch.mapred;

import java.io.IOException;

import org.apache.nutch.fs.NutchFileSystem;

/** An output data format.  Output files are stored in a {@link
 * NutchFileSystem}. */
public interface OutputFormat {

  /** Construct a {@link RecordWriter}.
   *
   * @param fs the file system to write to
   * @param job the job whose output is being written
   * @param name the unique name for this part of the output
   * @return a {@link RecordWriter}
   */
  RecordWriter getRecordWriter(NutchFileSystem fs, JobConf job, String name)
    throws IOException;
}

