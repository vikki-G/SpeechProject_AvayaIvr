/**
 * Last generated by Orchestration Designer at: 2022-NOV-29  06:33:44 PM
 */
package english.prompts;

public class EngPromopt extends com.avaya.sce.runtime.Prompt {

	//{{START:CLASS:FIELDS
	//}}END:CLASS:FIELDS

	/**
	 * Constructor for EngPromopt.
	 */
	public EngPromopt() {
		//{{START:CLASS:CONSTRUCTOR
		super();
		//}}END:CLASS:CONSTRUCTOR
	}


	/**
	 * This method is generated automatically and should not be manually edited
	 * To manually edit the prompt, override:
	 * void updatePrompt()
	 * Last generated by Orchestration Designer at: 2022-NOV-29  06:34:34 PM
	 */
	public void buildPrompt(){
		com.avaya.sce.runtime.Format format = null;
		com.avaya.sce.runtime.RenderHint hint = null;
		com.avaya.sce.runtime.MediaPage mediaPage = null;
		setBarginType(com.avaya.sce.runtimecommon.SCERT.BARGIN_SPEECH);
		setName("EngPromopt");
		setOrder(com.avaya.sce.runtime.Prompt.STANDARD);

		// Prompt level 1
		setTimeout(1,8000);
		setBargin(1,true);

		add(1, new com.avaya.sce.runtime.PromptElement(com.avaya.sce.runtime.PromptElement.TEXT,"you have selected english flow", null));

	}
}
