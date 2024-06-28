{
	"id": "ac94cd4d-5de2-4ef6-84f6-d19ca3226860",
	"name": "procurement.Procurement-taskform.frm",
	"model": {
		"processName": "Procurement",
		"processId": "procurement.Procurement",
		"properties": [{
			"name": "device",
			"typeInfo": {
				"type": "BASE",
				"className": "java.lang.String",
				"multiple": false
			},
			"metaData": {
				"entries": []
			}
		}, {
			"name": "hrBudget",
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
			"name": "procuTeamAppro",
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
			"name": "selfprocure",
			"typeInfo": {
				"type": "BASE",
				"className": "java.lang.String",
				"multiple": false
			},
			"metaData": {
				"entries": []
			}
		}, {
			"name": "managerApro",
			"typeInfo": {
				"type": "BASE",
				"className": "java.lang.String",
				"multiple": false
			},
			"metaData": {
				"entries": []
			}
		},  {
			"name": "senManagAppro",
			"typeInfo": {
				"type": "BASE",
				"className": "java.lang.String",
				"multiple": false
			},
			"metaData": {
				"entries": []
			}
		  },  {
			"name": "procured",
			"typeInfo": {
				"type": "BASE",
				"className": "java.lang.String",
				"multiple": false
			},
			"metaData": {
				"entries": []
			}
		  
		}],
		"formModelType": "org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"
	},
	"fields": [{
		"maxLength": 100,
		"placeHolder": "Device",
		"id": "field_545702763125417E11",
		"name": "device",
		"label": "Device",
		"required": false,
		"readOnly": false,
		"validateOnChange": true,
		"binding": "device",
		"standaloneClassName": "java.lang.String",
		"code": "TextBox",
		"serializedFieldClassName": "org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"
	}],
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
					"dragTypeName": "org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent",
					"properties": {
						"field_id": "field_545702763125417E11",
						"form_id": "ac94cd4d-5de2-4ef6-84f6-d19ca3226860"
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
		}]
	}
}