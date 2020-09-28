
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
 * Class for supl.010.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccapssd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.010.001.02")
public class MxSupl01000102
    extends AbstractMX
{

    @XmlElement(name = "DTCCCAPSSD1", required = true)
    protected DTCCCAPSSD1V02 dtcccapssd1;
    public final static transient String BUSINESS_PROCESS = "supl";
    public final static transient int FUNCTIONALITY = 10;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {CorporateActionGeneralInformationSD16 .class, CorporateActionSD9 .class, CorporateActionUnallocatedBalanceSD1Choice.class, CorporateActionUnallocatedCashTransactionDetailsSD2 .class, CorporateActionUnallocatedDetailsSD2 .class, CorporateActionUnallocatedSecuritiesTransactionDetailsSD2 .class, CreditDebitCode.class, DTCAdjustmentPaymentType1Code.class, DTCCCAPSSD1V02 .class, DTCUnallocatedAdjustmentReason1Code.class, DateAndDateTimeChoice.class, DateFormat28Choice.class, DateType8Code.class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, LotteryType1Code.class, MxSupl01000102 .class, OtherIdentification2 .class, RestrictedFINActiveCurrencyAndAmount.class, SecurityIdentification15 .class, ShortLong1Code.class, SignedQuantityFormat4 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:supl.010.001.02";

    public MxSupl01000102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl01000102(final String xml) {
        this();
        MxSupl01000102 tmp = parse(xml);
        dtcccapssd1 = tmp.getDTCCCAPSSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl01000102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccapssd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAPSSD1V02 }
     *     
     */
    public DTCCCAPSSD1V02 getDTCCCAPSSD1() {
        return dtcccapssd1;
    }

    /**
     * Sets the value of the dtcccapssd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAPSSD1V02 }
     *     
     */
    public MxSupl01000102 setDTCCCAPSSD1(DTCCCAPSSD1V02 value) {
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
    public static MxSupl01000102 parse(String xml) {
        return ((MxSupl01000102) MxReadImpl.parse(MxSupl01000102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl01000102 parse(String xml, MxRead parserImpl) {
        return ((MxSupl01000102) parserImpl.read(MxSupl01000102 .class, xml, _classes));
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
     * Creates an MxSupl01000102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl01000102 message
     * @return
     *     a new instance of MxSupl01000102
     */
    public final static MxSupl01000102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSupl01000102 .class);
    }

}
