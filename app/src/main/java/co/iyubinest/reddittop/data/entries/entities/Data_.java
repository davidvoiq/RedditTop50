/**
 * Copyright (C) 2015 Cristian Gómez Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package co.iyubinest.reddittop.data.entries.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ {

  @SerializedName("title") @Expose public String title;
  @SerializedName("author") @Expose public String author;
  @SerializedName("created") @Expose public Integer created;
  @SerializedName("thumbnail") @Expose public String thumbnail;
  @SerializedName("num_comments") @Expose public Integer numComments;
  @SerializedName("preview") @Expose public Preview preview;
}
