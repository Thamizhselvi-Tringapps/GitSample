/*Package name for rule parser*/
package com.jinigram.ruleengine.beans;

/*Import statements with all required classes*/
import java.util.List;
import java.util.ArrayList;

/* Class to map with JSON rule template file */
@SuppressWarnings("rawtypes")
public class RuleConfigurationTemplate {

	
	public static class RuleTemplate {

		private List<ValueObject> valueObject;
		private List<RulesObject> ruleList;

		public List<ValueObject> getValueObject() {
			return valueObject;
		}

		public void setValueObject(List<ValueObject> valueObject) {
			this.valueObject = valueObject;
		}

		public List<RulesObject> getRuleList() {
	
			}

			public void setSuccess(Result success) {
				this.success = success;
			}

			public Result getFailure() {
				return failure;
			}

			public void setFailure(Result failure) {
				this.failure = failure;
			}

			public static class Result {
				private String operation;
				private String returnType;
				private int gotoRule;

				private ArrayList returnValue;

				public String getOperation() {
					return operation;
				}

				public void setOperation(String operation) {
					this.operation = operation;
				}

				public String getReturnType() {
					return returnType;
				}

				public void setReturnType(String returnType) {
					this.returnType = returnType;
				}

				public int getGotoRule() {
					return gotoRule;
				}

				public void setGotoRule(int gotoRule) {
					this.gotoRule = gotoRule;
				}

				public ArrayList getReturnValue() {
					return returnValue;
				}

				public void setReturnValue(ArrayList returnValue) {
					this.returnValue = returnValue;
				}
			}

			public int getRuleId() {
				return ruleId;
			}

			public void setRuleId(int ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleDescription() {
				return ruleDescription;
			}

			public void setRuleDescription(String ruleDescription) {
				this.ruleDescription = ruleDescription;
			}

			public String getRuleCondition() {
				return ruleCondition;
			}

			public void setRuleCondition(String ruleCondition) {
				this.ruleCondition = ruleCondition;
			}
		}

	}

}
