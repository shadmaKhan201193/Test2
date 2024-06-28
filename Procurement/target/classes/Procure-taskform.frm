{
	"id": "560b2bf6-961e-41ec-98b0-19e5c4ccdf70",
	"name": "Procure-taskform.frm",
	"model": {
		"taskName": "Procure",
		"processId": "procurement.Procurement",
		"name": "task",
		"properties": [{
				"name": "hrBudget",
				"typeInfo": {
					"type": "BASE",
					"className": "java.lang.String",
					"multiple": false
				},
				"metaData": {
					"entries": []
				}
			}, {
				"name": "procuTeamAppro",
				"typeInfo": {
					"type": "BASE",
					"className": "java.lang.String",
					"multiple": false
				},
				"metaData": {
					"entries": []
				}
			}, {
				"name": "selfprocure",
				"typeInfo": {
					"type": "BASE",
					"className": "java.lang.String",
					"multiple": false
				},
				"metaData": {
					"entries": []
				}
			},
			{
				"name": "managerApro",
				"typeInfo": {
					"type": "BASE",
					"className": "java.lang.String",
					"multiple": false
				},
				"metaData": {
					"entries": []
				}
			},
			{
				"name": "senManagAppro",
				"typeInfo": {
					"type": "BASE",
					"className": "java.lang.String",
					"multiple": false
				},
				"metaData": {
					"entries": []
				}
			},
			{
				"name": "procured",
				"typeInfo": {
					"type": "BASE",
					"className": "java.lang.String",
					"multiple": false
				},
				"metaData": {
					"entries": []
				}
			}
		],
		"formModelType": "org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"
	},
	"fields": [{
			"maxLength": 100,
			"placeHolder": "HrBudget",
			"id": "field_370712616658167E12",
			"name": "hrBudget",
			"label": "HrBudget",
			"required": false,
			"readOnly": false,
			"validateOnChange": true,
			"binding": "HrBudget",
			"standaloneClassName": "java.lang.String",
			"code": "TextBox",
			"serializedFieldClassName": "org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"
		},
		{
			"maxLength": 100,
			"placeHolder": "ProcuTeamAppro",
			"id": "field_1309651698917332E12",
			"name": "procuTeamAppro",
			"label": "ProcuTeamAppro",
			"required": false,
			"readOnly": false,
			"validateOnChange": true,
			"binding": "procuTeamAppro",
			"standaloneClassName": "java.lang.String",
			"code": "TextBox",
			"serializedFieldClassName": "org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"
		}, {
			"maxLength": 100,
			"placeHolder": "Selfprocure",
			"id": "field_137043450749672E11",
			"name": "selfprocure",
			"label": "Selfprocure",
			"required": false,
			"readOnly": false,
			"validateOnChange": true,
			"binding": "selfprocure",
			"standaloneClassName": "java.lang.String",
			"code": "TextBox",
			"serializedFieldClassName": "org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"
		},
			    {
			"maxLength": 100,
			"placeHolder": "ManagerApro",
			"id": "field_137043450749672E11",
			"name": "managerApro",
			"label": "ManagerApro",
			"required": false,
			"readOnly": false,
			"validateOnChange": true,
			"binding": "managerApro",
			"standaloneClassName": "java.lang.String",
			"code": "TextBox",
			"serializedFieldClassName": "org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"
		},
			   {
			"maxLength": 100,
			"placeHolder": "SenManagAppro",
			"id": "field_137043450749672E11",
			"name": "senManagAppro",
			"label": "SenManagAppro",
			"required": false,
			"readOnly": false,
			"validateOnChange": true,
			"binding": "senManagAppro",
			"standaloneClassName": "java.lang.String",
			"code": "TextBox",
			"serializedFieldClassName": "org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"
		},
			    {
			"maxLength": 100,
			"placeHolder": "Procured",
			"id": "field_137043450749672E11",
			"name": "procured",
			"label": "Procured",
			"required": false,
			"readOnly": false,
			"validateOnChange": true,
			"binding": "procured",
			"standaloneClassName": "java.lang.String",
			"code": "TextBox",
			"serializedFieldClassName": "org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"
		}
	],
	"layoutTemplate": {
		"version": 3,
		"style": "FLUID",
		"layoutProperties": {},
		"rows": [{
				"height": "12",
				"properties": {},
				"layoutColumns": [{
					"span": "12",
					"height": "12",
					"properties": {},
					"rows": [],
					"layoutComponents": [{
						"dragTypeName": "org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent",
						"properties": {
							"HTML_CODE": "\u003ch3\u003eOutputs:\u003c/h3\u003e"
						},
						"parts": []
					}]
				}]
			}, {
				"height": "12",
				"properties": {},
				"layoutColumns": [{
					"span": "12",
					"height": "12",
					"properties": {},
					"rows": [],
					"layoutComponents": [{
						"dragTypeName": "org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent",
						"properties": {
							"field_id": "field_370712616658167E12",
							"form_id": "560b2bf6-961e-41ec-98b0-19e5c4ccdf70"
						},
						"parts": [{
							"partId": "TextBox",
							"cssProperties": {}
						}, {
							"partId": "Field Label",
							"cssProperties": {}
						}]
					}]
				}]
			}, {
				"height": "12",
				"properties": {},
				"layoutColumns": [{
					"span": "12",
					"height": "12",
					"properties": {},
					"rows": [],
					"layoutComponents": [{
						"dragTypeName": "org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent",
						"properties": {
							"field_id": "field_1309651698917332E12",
							"form_id": "560b2bf6-961e-41ec-98b0-19e5c4ccdf70"
						},
						"parts": [{
							"partId": "TextBox",
							"cssProperties": {}
						}, {
							"partId": "Field Label",
							"cssProperties": {}
						}]
					}]
				}]
			},
			{
				"height": "12",
				"properties": {},
				"layoutColumns": [{
					"span": "12",
					"height": "12",
					"properties": {},
					"rows": [],
					"layoutComponents": [{
						"dragTypeName": "org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent",
						"properties": {
							"field_id": "field_137043450749672E11",
							"form_id": "560b2bf6-961e-41ec-98b0-19e5c4ccdf70"
						},
						"parts": [{
							"partId": "TextBox",
							"cssProperties": {}
						}, {
							"partId": "Field Label",
							"cssProperties": {}
						}]
					}]
				}]
			}
		]
	}
}