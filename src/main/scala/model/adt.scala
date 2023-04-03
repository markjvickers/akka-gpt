package model

/** Represents a request to the GPT-4 API.
  *
  * @param prompt the text prompt for the GPT-4 model
  * @param maxTokens the maximum number of tokens in the generated response
  * @param temperature controls the randomness of the generated text
  * @param topP controls nucleus sampling for token filtering
  * @param n the number of completions to generate
  */
case class GPT4Request(prompt: String, maxTokens: Int, temperature: Double, topP: Double, n: Int)

/** Represents a completion response from the GPT-4 API.
  *
  * @param choices a list of individual completions generated by the GPT-4 API
  */
case class GPT4Completion(choices: List[GPT4Choice])

/** Represents an individual completion choice in the response.
  *
  * @param text the generated text completion
  * @param index the index of the completion in the list of generated completions
  * @param logprobs optional token-level probabilities for the generated text
  * @param finishReason the reason the generated text was completed
  */
case class GPT4Choice(text: String, index: Int, logprobs: Option[GPT4LogProbs], finishReason: String)

/** Contains token-level probability information for the generated text.
  *
  * @param tokens a list of tokens in the generated text
  * @param tokenLogprobs a list of log probabilities for the tokens
  * @param topLogprobs a list of lists with top tokens and their log probabilities at each position
  * @param textOffset a list of integer offsets indicating the position of each token in the generated text
  */
case class GPT4LogProbs(tokens: List[String], tokenLogprobs: List[Double], topLogprobs: List[List[(String, Double)]], textOffset: List[Int])

/** Represents an error response from the GPT-4 API.
  *
  * @param code the error code
  * @param message the error message
  */
case class GPT4Error(code: String, message: String)