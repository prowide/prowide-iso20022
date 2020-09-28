
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
 * Class for supl.010.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccapssd1"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:supl.010.001.07")
public class MxSupl01000107
    extends AbstractMX
{

    @XmlElement(name = "DTCCCAPSSD1", required = true)
    protected DTCCCAPSSD1V07 dtcccapssd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionGeneralInformationSD34 .class, CorporateActionSD19 .class, CorporateActionUnallocatedBalanceSD3 .class, CorporateActionUnallocatedBalanceSD3Choice.class, CorporateActionUnallocatedBalanceSD4 .class, CorporateActionUnallocatedCashTransactionDetailsSD6 .class, CorporateActionUnallocatedDetailsSD6 .class, CorporateActionUnallocatedSecuritiesTransactionDetailsSD7 .class, CreditDebitCode.class, DTCAdjustmentPaymentType5Code.class, DTCCCAPSSD1V07 .class, DTCCSubEventType6Code.class, DTCUnallocatedAdjustmentReason4Code.class, DateAndDateTime2Choice.class, DateFormat48Choice.class, DateType8Code.class, EventGroup2Code.class, ExtendedEventType6Code.class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, LotteryType1Code.class, MxSupl01000107 .class, OtherIdentification2 .class, RestrictedFINActiveCurrencyAndAmount.class, SecurityIdentification20 .class, ShortLong1Code.class, SignedQuantityFormat9 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:supl.010.001.07";

    public MxSupl01000107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl01000107(final String xml) {
        this();
        MxSupl01000107 tmp = parse(xml);
        dtcccapssd1 = tmp.getDTCCCAPSSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl01000107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccapssd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAPSSD1V07 }
     *     
     */
    public DTCCCAPSSD1V07 getDTCCCAPSSD1() {
        return dtcccapssd1;
    }

    /**
     * Sets the value of the dtcccapssd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAPSSD1V07 }
     *     
     */
    public MxSupl01000107 setDTCCCAPSSD1(DTCCCAPSSD1V07 value) {
        this.dtcccapssd1 = value;
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
    public static MxSupl01000107 parse(String xml) {
        return ((MxSupl01000107) MxReadImpl.parse(MxSupl01000107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl01000107 parse(String xml, MxRead parserImpl) {
        return ((MxSupl01000107) parserImpl.read(MxSupl01000107 .class, xml, _classes));
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
     * Creates an MxSupl01000107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl01000107 message
     * @return
     *     a new instance of MxSupl01000107
     */
    public final static MxSupl01000107 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSupl01000107 .class);
    }

}
