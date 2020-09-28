
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.011.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccacosd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.011.001.01")
public class MxSupl01100101
    extends AbstractMX
{

    @XmlElement(name = "DTCCCACOSD1", required = true)
    protected DTCCCACOSD1V01 dtcccacosd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionConfirmationCashMovementDetailsSD1 .class, CorporateActionConfirmationSecuritiesMovementDetailsSD1 .class, CorporateActionGeneralInformationSD1 .class, CreditDebitCode.class, DTCAdjustmentPaymentType1Code.class, DTCCCACOSD1V01 .class, DateAndDateTimeChoice.class, DateCode12Choice.class, DateFormat22Choice.class, DateType8Code.class, FinancialInstrumentQuantity15Choice.class, GenericIdentification25 .class, MxSupl01100101 .class, RestrictedFINActiveCurrencyAndAmount.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.011.001.01";

    public MxSupl01100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl01100101(final String xml) {
        this();
        MxSupl01100101 tmp = parse(xml);
        dtcccacosd1 = tmp.getDTCCCACOSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl01100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccacosd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCACOSD1V01 }
     *     
     */
    public DTCCCACOSD1V01 getDTCCCACOSD1() {
        return dtcccacosd1;
    }

    /**
     * Sets the value of the dtcccacosd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCACOSD1V01 }
     *     
     */
    public MxSupl01100101 setDTCCCACOSD1(DTCCCACOSD1V01 value) {
        this.dtcccacosd1 = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSupl01100101 parse(String xml) {
        return ((MxSupl01100101) MxReadImpl.parse(MxSupl01100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl01100101 parse(String xml, MxRead parserImpl) {
        return ((MxSupl01100101) parserImpl.read(MxSupl01100101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSupl01100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl01100101 message
     * @return
     *     a new instance of MxSupl01100101
     */
    public final static MxSupl01100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSupl01100101 .class);
    }

}
