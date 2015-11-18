/*
 * generated by Xtext 2.9.0.beta5
 */
package io.lattekit.dsl.ide.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import io.lattekit.dsl.services.LatteCSSGrammarAccess;

public class LatteCSSParser extends AbstractContentAssistParser {
	
	@Inject
	private LatteCSSGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected io.lattekit.dsl.ide.contentassist.antlr.internal.InternalLatteCSSParser createParser() {
		io.lattekit.dsl.ide.contentassist.antlr.internal.InternalLatteCSSParser result = new io.lattekit.dsl.ide.contentassist.antlr.internal.InternalLatteCSSParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSimpleSelectorAccess().getAlternatives(), "rule__SimpleSelector__Alternatives");
					put(grammarAccess.getCSSPropertyAccess().getAlternatives_0(), "rule__CSSProperty__Alternatives_0");
					put(grammarAccess.getFontStylePropertyAccess().getValueAlternatives_2_0(), "rule__FontStyleProperty__ValueAlternatives_2_0");
					put(grammarAccess.getViewSizePropertyAccess().getPropertyAlternatives_0_0(), "rule__ViewSizeProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getShorthandSizePropertyAccess().getPropertyAlternatives_0_0(), "rule__ShorthandSizeProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getBorderRadiusPropertyAccess().getPropertyAlternatives_0_0(), "rule__BorderRadiusProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getSizePropertyAccess().getPropertyAlternatives_0_0(), "rule__SizeProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getBorderPropertyAccess().getPropertyAlternatives_0_0(), "rule__BorderProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getBorderPropertyAccess().getStyleAlternatives_3_0(), "rule__BorderProperty__StyleAlternatives_3_0");
					put(grammarAccess.getRepeatValueAccess().getAlternatives(), "rule__RepeatValue__Alternatives");
					put(grammarAccess.getGravityValueAccess().getAlternatives(), "rule__GravityValue__Alternatives");
					put(grammarAccess.getFilterValueAccess().getAlternatives(), "rule__FilterValue__Alternatives");
					put(grammarAccess.getColorPropertyAccess().getPropertyAlternatives_0_0(), "rule__ColorProperty__PropertyAlternatives_0_0");
					put(grammarAccess.getAlignmentPropertyAccess().getValueAlternatives_2_0(), "rule__AlignmentProperty__ValueAlternatives_2_0");
					put(grammarAccess.getTimingFunctionAccess().getAlternatives(), "rule__TimingFunction__Alternatives");
					put(grammarAccess.getPropertyNameValueAccess().getAlternatives(), "rule__PropertyNameValue__Alternatives");
					put(grammarAccess.getNumberValueAccess().getAlternatives(), "rule__NumberValue__Alternatives");
					put(grammarAccess.getTimeValueAccess().getUnitAlternatives_1_0(), "rule__TimeValue__UnitAlternatives_1_0");
					put(grammarAccess.getViewSizeValueAccess().getAlternatives(), "rule__ViewSizeValue__Alternatives");
					put(grammarAccess.getViewSizeValueAccess().getDynamicAlternatives_1_0(), "rule__ViewSizeValue__DynamicAlternatives_1_0");
					put(grammarAccess.getSizeValueAccess().getDimensionAlternatives_1_0(), "rule__SizeValue__DimensionAlternatives_1_0");
					put(grammarAccess.getFontStyleValueAccess().getAlternatives(), "rule__FontStyleValue__Alternatives");
					put(grammarAccess.getPaintValueAccess().getAlternatives(), "rule__PaintValue__Alternatives");
					put(grammarAccess.getLinearGradientAccess().getAlternatives_14(), "rule__LinearGradient__Alternatives_14");
					put(grammarAccess.getRadialGradientAccess().getAlternatives_6(), "rule__RadialGradient__Alternatives_6");
					put(grammarAccess.getColorValueAccess().getAlternatives(), "rule__ColorValue__Alternatives");
					put(grammarAccess.getNamedColorAccess().getAlternatives(), "rule__NamedColor__Alternatives");
					put(grammarAccess.getRGBColorAccess().getAlternatives(), "rule__RGBColor__Alternatives");
					put(grammarAccess.getHSBColorAccess().getAlternatives(), "rule__HSBColor__Alternatives");
					put(grammarAccess.getColorFunctionAccess().getAlternatives(), "rule__ColorFunction__Alternatives");
					put(grammarAccess.getDefinitionAccess().getGroup(), "rule__Definition__Group__0");
					put(grammarAccess.getDefinitionAccess().getGroup_1(), "rule__Definition__Group_1__0");
					put(grammarAccess.getSimpleSelectorAccess().getGroup_1(), "rule__SimpleSelector__Group_1__0");
					put(grammarAccess.getSimpleSelectorAccess().getGroup_2(), "rule__SimpleSelector__Group_2__0");
					put(grammarAccess.getIdSelectorAccess().getGroup(), "rule__IdSelector__Group__0");
					put(grammarAccess.getClassSelectorAccess().getGroup(), "rule__ClassSelector__Group__0");
					put(grammarAccess.getPseudoClassSelectorAccess().getGroup(), "rule__PseudoClassSelector__Group__0");
					put(grammarAccess.getCSSPropertyAccess().getGroup(), "rule__CSSProperty__Group__0");
					put(grammarAccess.getFontFamilyPropertyAccess().getGroup(), "rule__FontFamilyProperty__Group__0");
					put(grammarAccess.getFontStylePropertyAccess().getGroup(), "rule__FontStyleProperty__Group__0");
					put(grammarAccess.getViewSizePropertyAccess().getGroup(), "rule__ViewSizeProperty__Group__0");
					put(grammarAccess.getShorthandSizePropertyAccess().getGroup(), "rule__ShorthandSizeProperty__Group__0");
					put(grammarAccess.getBorderRadiusPropertyAccess().getGroup(), "rule__BorderRadiusProperty__Group__0");
					put(grammarAccess.getSizePropertyAccess().getGroup(), "rule__SizeProperty__Group__0");
					put(grammarAccess.getPaintPropertyAccess().getGroup(), "rule__PaintProperty__Group__0");
					put(grammarAccess.getTransitionPropertyAccess().getGroup(), "rule__TransitionProperty__Group__0");
					put(grammarAccess.getTransitionPropertyAccess().getGroup_3(), "rule__TransitionProperty__Group_3__0");
					put(grammarAccess.getTransitionValueAccess().getGroup(), "rule__TransitionValue__Group__0");
					put(grammarAccess.getDrawablePropertyAccess().getGroup(), "rule__DrawableProperty__Group__0");
					put(grammarAccess.getBackgroundRepeatPropertyAccess().getGroup(), "rule__BackgroundRepeatProperty__Group__0");
					put(grammarAccess.getBorderPropertyAccess().getGroup(), "rule__BorderProperty__Group__0");
					put(grammarAccess.getBackgroundFilterPropertyAccess().getGroup(), "rule__BackgroundFilterProperty__Group__0");
					put(grammarAccess.getBackgroundGravityPropertyAccess().getGroup(), "rule__BackgroundGravityProperty__Group__0");
					put(grammarAccess.getBackgroundGravityPropertyAccess().getGroup_3(), "rule__BackgroundGravityProperty__Group_3__0");
					put(grammarAccess.getBackgroundFilterTypePropertyAccess().getGroup(), "rule__BackgroundFilterTypeProperty__Group__0");
					put(grammarAccess.getShorthandColorPropertyAccess().getGroup(), "rule__ShorthandColorProperty__Group__0");
					put(grammarAccess.getColorPropertyAccess().getGroup(), "rule__ColorProperty__Group__0");
					put(grammarAccess.getAlignmentPropertyAccess().getGroup(), "rule__AlignmentProperty__Group__0");
					put(grammarAccess.getTimeValueAccess().getGroup(), "rule__TimeValue__Group__0");
					put(grammarAccess.getSizeValueAccess().getGroup(), "rule__SizeValue__Group__0");
					put(grammarAccess.getLinearGradientAccess().getGroup(), "rule__LinearGradient__Group__0");
					put(grammarAccess.getLinearGradientAccess().getGroup_13(), "rule__LinearGradient__Group_13__0");
					put(grammarAccess.getRadialGradientAccess().getGroup(), "rule__RadialGradient__Group__0");
					put(grammarAccess.getRadialGradientAccess().getGroup_1(), "rule__RadialGradient__Group_1__0");
					put(grammarAccess.getRadialGradientAccess().getGroup_3(), "rule__RadialGradient__Group_3__0");
					put(grammarAccess.getRadialGradientAccess().getGroup_5(), "rule__RadialGradient__Group_5__0");
					put(grammarAccess.getStopValueAccess().getGroup(), "rule__StopValue__Group__0");
					put(grammarAccess.getRGBColorAccess().getGroup_1(), "rule__RGBColor__Group_1__0");
					put(grammarAccess.getRGBColorAccess().getGroup_2(), "rule__RGBColor__Group_2__0");
					put(grammarAccess.getHSBColorAccess().getGroup_0(), "rule__HSBColor__Group_0__0");
					put(grammarAccess.getHSBColorAccess().getGroup_1(), "rule__HSBColor__Group_1__0");
					put(grammarAccess.getColorFunctionAccess().getGroup_0(), "rule__ColorFunction__Group_0__0");
					put(grammarAccess.getColorFunctionAccess().getGroup_1(), "rule__ColorFunction__Group_1__0");
					put(grammarAccess.getColorFunctionAccess().getGroup_1_5(), "rule__ColorFunction__Group_1_5__0");
					put(grammarAccess.getCSSAccess().getDefinitionsAssignment(), "rule__CSS__DefinitionsAssignment");
					put(grammarAccess.getDefinitionAccess().getSelectorAssignment_0(), "rule__Definition__SelectorAssignment_0");
					put(grammarAccess.getDefinitionAccess().getSelectorAssignment_1_1(), "rule__Definition__SelectorAssignment_1_1");
					put(grammarAccess.getDefinitionAccess().getPropertiesAssignment_3(), "rule__Definition__PropertiesAssignment_3");
					put(grammarAccess.getSelectorAccess().getSimpleSelectorAssignment(), "rule__Selector__SimpleSelectorAssignment");
					put(grammarAccess.getSimpleSelectorAccess().getElementAssignment_0(), "rule__SimpleSelector__ElementAssignment_0");
					put(grammarAccess.getSimpleSelectorAccess().getIdAssignment_1_0(), "rule__SimpleSelector__IdAssignment_1_0");
					put(grammarAccess.getSimpleSelectorAccess().getPseudoClassAssignment_1_1(), "rule__SimpleSelector__PseudoClassAssignment_1_1");
					put(grammarAccess.getSimpleSelectorAccess().getClassAssignment_2_0(), "rule__SimpleSelector__ClassAssignment_2_0");
					put(grammarAccess.getSimpleSelectorAccess().getPseudoClassAssignment_2_1(), "rule__SimpleSelector__PseudoClassAssignment_2_1");
					put(grammarAccess.getIdSelectorAccess().getIdAssignment_1(), "rule__IdSelector__IdAssignment_1");
					put(grammarAccess.getClassSelectorAccess().getClassAssignment_1(), "rule__ClassSelector__ClassAssignment_1");
					put(grammarAccess.getPseudoClassSelectorAccess().getValueAssignment_1(), "rule__PseudoClassSelector__ValueAssignment_1");
					put(grammarAccess.getFontFamilyPropertyAccess().getPropertyAssignment_0(), "rule__FontFamilyProperty__PropertyAssignment_0");
					put(grammarAccess.getFontFamilyPropertyAccess().getValueAssignment_2(), "rule__FontFamilyProperty__ValueAssignment_2");
					put(grammarAccess.getFontStylePropertyAccess().getPropertyAssignment_0(), "rule__FontStyleProperty__PropertyAssignment_0");
					put(grammarAccess.getFontStylePropertyAccess().getValueAssignment_2(), "rule__FontStyleProperty__ValueAssignment_2");
					put(grammarAccess.getViewSizePropertyAccess().getPropertyAssignment_0(), "rule__ViewSizeProperty__PropertyAssignment_0");
					put(grammarAccess.getViewSizePropertyAccess().getValueAssignment_2(), "rule__ViewSizeProperty__ValueAssignment_2");
					put(grammarAccess.getShorthandSizePropertyAccess().getPropertyAssignment_0(), "rule__ShorthandSizeProperty__PropertyAssignment_0");
					put(grammarAccess.getShorthandSizePropertyAccess().getValuesAssignment_2(), "rule__ShorthandSizeProperty__ValuesAssignment_2");
					put(grammarAccess.getBorderRadiusPropertyAccess().getPropertyAssignment_0(), "rule__BorderRadiusProperty__PropertyAssignment_0");
					put(grammarAccess.getBorderRadiusPropertyAccess().getValuesAssignment_2(), "rule__BorderRadiusProperty__ValuesAssignment_2");
					put(grammarAccess.getSizePropertyAccess().getPropertyAssignment_0(), "rule__SizeProperty__PropertyAssignment_0");
					put(grammarAccess.getSizePropertyAccess().getValueAssignment_2(), "rule__SizeProperty__ValueAssignment_2");
					put(grammarAccess.getPaintPropertyAccess().getPropertyAssignment_0(), "rule__PaintProperty__PropertyAssignment_0");
					put(grammarAccess.getPaintPropertyAccess().getValueAssignment_2(), "rule__PaintProperty__ValueAssignment_2");
					put(grammarAccess.getTransitionPropertyAccess().getPropertyAssignment_0(), "rule__TransitionProperty__PropertyAssignment_0");
					put(grammarAccess.getTransitionPropertyAccess().getTransitionsAssignment_2(), "rule__TransitionProperty__TransitionsAssignment_2");
					put(grammarAccess.getTransitionPropertyAccess().getTransitionsAssignment_3_1(), "rule__TransitionProperty__TransitionsAssignment_3_1");
					put(grammarAccess.getTransitionValueAccess().getPropertyNameAssignment_0(), "rule__TransitionValue__PropertyNameAssignment_0");
					put(grammarAccess.getTransitionValueAccess().getDurationAssignment_1(), "rule__TransitionValue__DurationAssignment_1");
					put(grammarAccess.getTransitionValueAccess().getTimingFunctionAssignment_2(), "rule__TransitionValue__TimingFunctionAssignment_2");
					put(grammarAccess.getTransitionValueAccess().getDelayAssignment_3(), "rule__TransitionValue__DelayAssignment_3");
					put(grammarAccess.getDrawablePropertyAccess().getPropertyAssignment_0(), "rule__DrawableProperty__PropertyAssignment_0");
					put(grammarAccess.getDrawablePropertyAccess().getValueAssignment_2(), "rule__DrawableProperty__ValueAssignment_2");
					put(grammarAccess.getBackgroundRepeatPropertyAccess().getPropertyAssignment_0(), "rule__BackgroundRepeatProperty__PropertyAssignment_0");
					put(grammarAccess.getBackgroundRepeatPropertyAccess().getValuesAssignment_2(), "rule__BackgroundRepeatProperty__ValuesAssignment_2");
					put(grammarAccess.getBackgroundRepeatPropertyAccess().getValuesAssignment_3(), "rule__BackgroundRepeatProperty__ValuesAssignment_3");
					put(grammarAccess.getBorderPropertyAccess().getPropertyAssignment_0(), "rule__BorderProperty__PropertyAssignment_0");
					put(grammarAccess.getBorderPropertyAccess().getWidthAssignment_2(), "rule__BorderProperty__WidthAssignment_2");
					put(grammarAccess.getBorderPropertyAccess().getStyleAssignment_3(), "rule__BorderProperty__StyleAssignment_3");
					put(grammarAccess.getBorderPropertyAccess().getColorAssignment_4(), "rule__BorderProperty__ColorAssignment_4");
					put(grammarAccess.getBackgroundFilterPropertyAccess().getPropertyAssignment_0(), "rule__BackgroundFilterProperty__PropertyAssignment_0");
					put(grammarAccess.getBackgroundFilterPropertyAccess().getColorAssignment_2(), "rule__BackgroundFilterProperty__ColorAssignment_2");
					put(grammarAccess.getBackgroundFilterPropertyAccess().getFilterAssignment_3(), "rule__BackgroundFilterProperty__FilterAssignment_3");
					put(grammarAccess.getBackgroundGravityPropertyAccess().getPropertyAssignment_0(), "rule__BackgroundGravityProperty__PropertyAssignment_0");
					put(grammarAccess.getBackgroundGravityPropertyAccess().getValuesAssignment_2(), "rule__BackgroundGravityProperty__ValuesAssignment_2");
					put(grammarAccess.getBackgroundGravityPropertyAccess().getValuesAssignment_3_1(), "rule__BackgroundGravityProperty__ValuesAssignment_3_1");
					put(grammarAccess.getBackgroundFilterTypePropertyAccess().getPropertyAssignment_0(), "rule__BackgroundFilterTypeProperty__PropertyAssignment_0");
					put(grammarAccess.getBackgroundFilterTypePropertyAccess().getValueAssignment_2(), "rule__BackgroundFilterTypeProperty__ValueAssignment_2");
					put(grammarAccess.getShorthandColorPropertyAccess().getPropertyAssignment_0(), "rule__ShorthandColorProperty__PropertyAssignment_0");
					put(grammarAccess.getShorthandColorPropertyAccess().getValuesAssignment_2(), "rule__ShorthandColorProperty__ValuesAssignment_2");
					put(grammarAccess.getColorPropertyAccess().getPropertyAssignment_0(), "rule__ColorProperty__PropertyAssignment_0");
					put(grammarAccess.getColorPropertyAccess().getValueAssignment_2(), "rule__ColorProperty__ValueAssignment_2");
					put(grammarAccess.getAlignmentPropertyAccess().getPropertyAssignment_0(), "rule__AlignmentProperty__PropertyAssignment_0");
					put(grammarAccess.getAlignmentPropertyAccess().getValueAssignment_2(), "rule__AlignmentProperty__ValueAssignment_2");
					put(grammarAccess.getTimeValueAccess().getTimeAssignment_0(), "rule__TimeValue__TimeAssignment_0");
					put(grammarAccess.getTimeValueAccess().getUnitAssignment_1(), "rule__TimeValue__UnitAssignment_1");
					put(grammarAccess.getViewSizeValueAccess().getValueAssignment_0(), "rule__ViewSizeValue__ValueAssignment_0");
					put(grammarAccess.getViewSizeValueAccess().getDynamicAssignment_1(), "rule__ViewSizeValue__DynamicAssignment_1");
					put(grammarAccess.getSizeValueAccess().getValueAssignment_0(), "rule__SizeValue__ValueAssignment_0");
					put(grammarAccess.getSizeValueAccess().getDimensionAssignment_1(), "rule__SizeValue__DimensionAssignment_1");
					put(grammarAccess.getLinearGradientAccess().getX1Assignment_2(), "rule__LinearGradient__X1Assignment_2");
					put(grammarAccess.getLinearGradientAccess().getY1Assignment_4(), "rule__LinearGradient__Y1Assignment_4");
					put(grammarAccess.getLinearGradientAccess().getX2Assignment_8(), "rule__LinearGradient__X2Assignment_8");
					put(grammarAccess.getLinearGradientAccess().getY2Assignment_10(), "rule__LinearGradient__Y2Assignment_10");
					put(grammarAccess.getLinearGradientAccess().getStopsAssignment_13_1(), "rule__LinearGradient__StopsAssignment_13_1");
					put(grammarAccess.getRadialGradientAccess().getCxAssignment_1_1(), "rule__RadialGradient__CxAssignment_1_1");
					put(grammarAccess.getRadialGradientAccess().getCyAssignment_1_3(), "rule__RadialGradient__CyAssignment_1_3");
					put(grammarAccess.getRadialGradientAccess().getRadiusAssignment_2(), "rule__RadialGradient__RadiusAssignment_2");
					put(grammarAccess.getRadialGradientAccess().getFxAssignment_3_2(), "rule__RadialGradient__FxAssignment_3_2");
					put(grammarAccess.getRadialGradientAccess().getFyAssignment_3_4(), "rule__RadialGradient__FyAssignment_3_4");
					put(grammarAccess.getRadialGradientAccess().getStopsAssignment_5_1(), "rule__RadialGradient__StopsAssignment_5_1");
					put(grammarAccess.getStopValueAccess().getPosAssignment_0(), "rule__StopValue__PosAssignment_0");
					put(grammarAccess.getStopValueAccess().getColorAssignment_2(), "rule__StopValue__ColorAssignment_2");
					put(grammarAccess.getColorValueAccess().getNamedColorAssignment_0(), "rule__ColorValue__NamedColorAssignment_0");
					put(grammarAccess.getColorValueAccess().getRgbAssignment_1(), "rule__ColorValue__RgbAssignment_1");
					put(grammarAccess.getRGBColorAccess().getHexAssignment_0(), "rule__RGBColor__HexAssignment_0");
					put(grammarAccess.getRGBColorAccess().getRAssignment_1_2(), "rule__RGBColor__RAssignment_1_2");
					put(grammarAccess.getRGBColorAccess().getGAssignment_1_4(), "rule__RGBColor__GAssignment_1_4");
					put(grammarAccess.getRGBColorAccess().getBAssignment_1_6(), "rule__RGBColor__BAssignment_1_6");
					put(grammarAccess.getRGBColorAccess().getRAssignment_2_2(), "rule__RGBColor__RAssignment_2_2");
					put(grammarAccess.getRGBColorAccess().getGAssignment_2_4(), "rule__RGBColor__GAssignment_2_4");
					put(grammarAccess.getRGBColorAccess().getBAssignment_2_6(), "rule__RGBColor__BAssignment_2_6");
					put(grammarAccess.getRGBColorAccess().getAlphaAssignment_2_8(), "rule__RGBColor__AlphaAssignment_2_8");
					put(grammarAccess.getHSBColorAccess().getHueAssignment_0_2(), "rule__HSBColor__HueAssignment_0_2");
					put(grammarAccess.getHSBColorAccess().getSaturationAssignment_0_4(), "rule__HSBColor__SaturationAssignment_0_4");
					put(grammarAccess.getHSBColorAccess().getBrightnessAssignment_0_7(), "rule__HSBColor__BrightnessAssignment_0_7");
					put(grammarAccess.getHSBColorAccess().getHueAssignment_1_2(), "rule__HSBColor__HueAssignment_1_2");
					put(grammarAccess.getHSBColorAccess().getSaturationAssignment_1_4(), "rule__HSBColor__SaturationAssignment_1_4");
					put(grammarAccess.getHSBColorAccess().getBrightnessAssignment_1_7(), "rule__HSBColor__BrightnessAssignment_1_7");
					put(grammarAccess.getHSBColorAccess().getAlphaAssignment_1_10(), "rule__HSBColor__AlphaAssignment_1_10");
					put(grammarAccess.getColorFunctionAccess().getOrigAssignment_0_2(), "rule__ColorFunction__OrigAssignment_0_2");
					put(grammarAccess.getColorFunctionAccess().getModAssignment_0_4(), "rule__ColorFunction__ModAssignment_0_4");
					put(grammarAccess.getColorFunctionAccess().getOrigAssignment_1_2(), "rule__ColorFunction__OrigAssignment_1_2");
					put(grammarAccess.getColorFunctionAccess().getStopNumbersAssignment_1_5_1(), "rule__ColorFunction__StopNumbersAssignment_1_5_1");
					put(grammarAccess.getColorFunctionAccess().getStopColorsAssignment_1_5_3(), "rule__ColorFunction__StopColorsAssignment_1_5_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			io.lattekit.dsl.ide.contentassist.antlr.internal.InternalLatteCSSParser typedParser = (io.lattekit.dsl.ide.contentassist.antlr.internal.InternalLatteCSSParser) parser;
			typedParser.entryRuleCSS();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LatteCSSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LatteCSSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}