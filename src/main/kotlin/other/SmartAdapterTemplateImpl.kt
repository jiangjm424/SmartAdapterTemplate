package other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.card.jmdroidCardTemplate

class SmartAdapterTemplateImpl : WizardTemplateProvider() {
    override fun getTemplates(): List<Template> {
        return listOf(
                jmdroidCardTemplate,
        )
    }
}