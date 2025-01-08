
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
 * Class for supl.010.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dtcccapssd1"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:supl.010.001.04")
public class MxSupl01000104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DTCCCAPSSD1", required = true)
    protected DTCCCAPSSD1V04 dtcccapssd1;
    public static final transient String BUSINESS_PROCESS = "supl";
    public static final transient int FUNCTIONALITY = 10;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {CorporateActionGeneralInformationSD20 .class, CorporateActionSD9 .class, CorporateActionUnallocatedBalanceSD1 .class, CorporateActionUnallocatedBalanceSD2Choice.class, CorporateActionUnallocatedCashTransactionDetailsSD4 .class, CorporateActionUnallocatedDetailsSD4 .class, CorporateActionUnallocatedSecuritiesTransactionDetailsSD5 .class, CreditDebitCode.class, DTCAdjustmentPaymentType3Code.class, DTCCCAPSSD1V04 .class, DTCUnallocatedAdjustmentReason2Code.class, DateAndDateTimeChoice.class, DateFormat28Choice.class, DateType8Code.class, FinancialInstrumentQuantity15Choice.class, IdentificationSource4Choice.class, LotteryType1Code.class, MxSupl01000104 .class, OtherIdentification2 .class, RestrictedFINActiveCurrencyAndAmount.class, SecurityIdentification15 .class, ShortLong1Code.class, SignedQuantityFormat4 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:supl.010.001.04";

    public MxSupl01000104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSupl01000104(final String xml) {
        this();
        MxSupl01000104 tmp = parse(xml);
        dtcccapssd1 = tmp.getDTCCCAPSSD1();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSupl01000104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dtcccapssd1 property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCCAPSSD1V04 }
     *     
     */
    public DTCCCAPSSD1V04 getDTCCCAPSSD1() {
        return dtcccapssd1;
    }

    /**
     * Sets the value of the dtcccapssd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCCAPSSD1V04 }
     *     
     */
    public MxSupl01000104 setDTCCCAPSSD1(DTCCCAPSSD1V04 value) {
        this.dtcccapssd1 = value;
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
    public static MxSupl01000104 parse(String xml) {
        return ((MxSupl01000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl01000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSupl01000104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSupl01000104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSupl01000104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSupl01000104 parse(String xml, MxRead parserImpl) {
        return ((MxSupl01000104) parserImpl.read(MxSupl01000104 .class, xml, _classes));
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
     * Creates an MxSupl01000104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSupl01000104 message
     * @return
     *     a new instance of MxSupl01000104
     */
    public static final MxSupl01000104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSupl01000104 .class);
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
