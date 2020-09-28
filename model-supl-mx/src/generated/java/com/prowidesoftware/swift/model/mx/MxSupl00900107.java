
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
 * Class for supl.009.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccapasd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.009.001.07")
public class MxSupl00900107
    extends AbstractMX
{

    @XmlElement(name = "DTCCCAPASD1", required = true)
    protected DTCCCAPASD1V07 dtcccapasd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionBalanceSD4 .class, CorporateActionGeneralInformationSD39 .class, CorporateActionMovementCashMovementDetailsSD5 .class, CorporateActionMovementSecuritiesMovementDetailsSD5 .class, CorporateActionSD18 .class, CreditDebitCode.class, DTCAdjustmentPaymentSubReason2Code.class, DTCAdjustmentPaymentType4Code.class, DTCCCAPASD1V07 .class, DTCCPayoutType4Code.class, DTCCPayoutType5Code.class, DTCCSubEventType7Code.class, DateAndDateTime2Choice.class, DateFormat48Choice.class, DateType8Code.class, EventGroup1Code.class, ExtendedEventType6Code.class, FinancialInstrumentAttributesSD17 .class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, MxSupl00900107 .class, OptionTransactionDetailsSD3 .class, OtherIdentification2 .class, RestrictedFINActiveCurrencyAndAmount.class, ShortLong1Code.class, SignedQuantityFormat9 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.009.001.07";

    public MxSupl00900107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl00900107(final String xml) {
        this();
        MxSupl00900107 tmp = parse(xml);
        dtcccapasd1 = tmp.getDTCCCAPASD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl00900107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccapasd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAPASD1V07 }
     *     
     */
    public DTCCCAPASD1V07 getDTCCCAPASD1() {
        return dtcccapasd1;
    }

    /**
     * Sets the value of the dtcccapasd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAPASD1V07 }
     *     
     */
    public MxSupl00900107 setDTCCCAPASD1(DTCCCAPASD1V07 value) {
        this.dtcccapasd1 = value;
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
    public static MxSupl00900107 parse(String xml) {
        return ((MxSupl00900107) MxReadImpl.parse(MxSupl00900107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl00900107 parse(String xml, MxRead parserImpl) {
        return ((MxSupl00900107) parserImpl.read(MxSupl00900107 .class, xml, _classes));
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
     * Creates an MxSupl00900107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl00900107 message
     * @return
     *     a new instance of MxSupl00900107
     */
    public final static MxSupl00900107 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSupl00900107 .class);
    }

}
