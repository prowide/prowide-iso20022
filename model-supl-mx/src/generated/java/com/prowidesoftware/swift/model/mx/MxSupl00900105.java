
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for supl.009.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccapasd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.009.001.05")
public class MxSupl00900105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCAPASD1", required = true)
    protected DTCCCAPASD1V05 dtcccapasd1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CorporateActionBalanceSD3 .class, CorporateActionGeneralInformationSD25 .class, CorporateActionMovementCashMovementDetailsSD4 .class, CorporateActionMovementSecuritiesMovementDetailsSD4 .class, CorporateActionQuantitySD2 .class, CorporateActionSD8 .class, CreditDebitCode.class, DTCAdjustmentPaymentSubReason1Code.class, DTCAdjustmentPaymentType2Code.class, DTCCCAPASD1V05 .class, DTCCPayoutType4Code.class, DTCCPayoutType5Code.class, DTCCSubEventType5Code.class, DateAndDateTimeChoice.class, DateFormat28Choice.class, DateType8Code.class, EventGroup1Code.class, ExtendedEventType4Code.class, FinancialInstrumentAttributesSD9 .class, FinancialInstrumentQuantity15Choice.class, FinancialInstrumentQuantity22Choice.class, IdentificationSource4Choice.class, MxSupl00900105 .class, OptionTransactionDetailsSD1 .class, OtherIdentification2 .class, Quantity5Code.class, RestrictedFINActiveCurrencyAndAmount.class, ShortLong1Code.class, SignedQuantityFormat9 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:supl.009.001.05";

    public MxSupl00900105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00900105(final String xml) {
        this();
        MxSupl00900105 tmp = parse(xml);
        dtcccapasd1 = tmp.getDTCCCAPASD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00900105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccapasd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAPASD1V05 }
     *     
     */
    public DTCCCAPASD1V05 getDTCCCAPASD1() {
        return dtcccapasd1;
    }

    /**
     * Sets the value of the dtcccapasd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAPASD1V05 }
     *     
     */
    public MxSupl00900105 setDTCCCAPASD1(DTCCCAPASD1V05 value) {
        this.dtcccapasd1 = value;
        return this;
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
    public static MxSupl00900105 parse(String xml) {
        return ((MxSupl00900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl00900105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl00900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl00900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00900105 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00900105) parserImpl.read(MxSupl00900105 .class, xml, _classes));
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
     * Creates an MxSupl00900105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00900105 message
     * @return
     *     a new instance of MxSupl00900105
     */
    public static final MxSupl00900105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl00900105 .class);
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

}
