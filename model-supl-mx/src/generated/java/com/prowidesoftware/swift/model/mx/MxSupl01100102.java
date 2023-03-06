
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.011.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccacosd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.011.001.02")
public class MxSupl01100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCACOSD1", required = true)
    protected DTCCCACOSD1V02 dtcccacosd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountBalanceSD4 .class, CorporateActionConfirmationCashMovementDetailsSD2 .class, CorporateActionConfirmationSecuritiesMovementDetailsSD2 .class, CorporateActionGeneralInformationSD14 .class, CorporateActionSD10 .class, CreditDebitCode.class, DTCAdjustmentPaymentSubReason1Code.class, DTCAdjustmentPaymentType2Code.class, DTCCCACOSD1V02 .class, DateAndDateTimeChoice.class, DateFormat28Choice.class, DateType8Code.class, FinancialInstrumentAttributesSD9 .class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, MxSupl01100102 .class, OtherIdentification2 .class, RestrictedFINActiveCurrencyAndAmount.class, ShortLong1Code.class, SignedQuantityFormat4 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.011.001.02";

    public MxSupl01100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl01100102(final String xml) {
        this();
        MxSupl01100102 tmp = parse(xml);
        dtcccacosd1 = tmp.getDTCCCACOSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl01100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccacosd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCACOSD1V02 }
     *     
     */
    public DTCCCACOSD1V02 getDTCCCACOSD1() {
        return dtcccacosd1;
    }

    /**
     * Sets the value of the dtcccacosd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCACOSD1V02 }
     *     
     */
    public MxSupl01100102 setDTCCCACOSD1(DTCCCACOSD1V02 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSupl01100102 parse(String xml) {
        return ((MxSupl01100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl01100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl01100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl01100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl01100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl01100102 parse(String xml, MxRead parserImpl) {
        return ((MxSupl01100102) parserImpl.read(MxSupl01100102 .class, xml, _classes));
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
     * Creates an MxSupl01100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl01100102 message
     * @return
     *     a new instance of MxSupl01100102
     */
    public final static MxSupl01100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl01100102 .class);
    }

}
