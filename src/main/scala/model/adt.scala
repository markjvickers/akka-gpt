package model

case class GPT4Request(prompt: String, maxTokens: Int, temperature: Double, topP: Double, n: Int)

case class GPT4Completion(choices: List[GPT4Choice])

case class GPT4Choice(text: String, index: Int, logprobs: Option[GPT4LogProbs], finishReason: String)

case class GPT4LogProbs(tokens: List[String], tokenLogprobs: List[Double], topLogprobs: List[List[(String, Double)]], textOffset: List[Int])

case class GPT4Error(code: String, message: String)

