
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
 * Class for tsmt.044.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "inttToPayNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.044.001.01")
public class MxTsmt04400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InttToPayNtfctn", required = true)
    protected IntentToPayNotificationV01 inttToPayNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, Adjustment4 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, BICIdentification1 .class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CurrencyAndAmount.class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, IntentToPay1 .class, IntentToPayNotificationV01 .class, InvoiceIdentification1 .class, MessageIdentification1 .class, MxTsmt04400101 .class, NameAndAddress6 .class, PostalAddress2 .class, ReportLine2 .class, ReportLine3 .class, ReportLine4 .class, SettlementTerms2 .class, SimpleIdentificationInformation.class, SimpleIdentificationInformation2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.044.001.01";

    public MxTsmt04400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt04400101(final String xml) {
        this();
        MxTsmt04400101 tmp = parse(xml);
        inttToPayNtfctn = tmp.getInttToPayNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt04400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the inttToPayNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link IntentToPayNotificationV01 }
     *     
     */
    public IntentToPayNotificationV01 getInttToPayNtfctn() {
        return inttToPayNtfctn;
    }

    /**
     * Sets the value of the inttToPayNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntentToPayNotificationV01 }
     *     
     */
    public MxTsmt04400101 setInttToPayNtfctn(IntentToPayNotificationV01 value) {
        this.inttToPayNtfctn = value;
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
    public static MxTsmt04400101 parse(String xml) {
        return ((MxTsmt04400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt04400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxTsmt04400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxTsmt04400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxTsmt04400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt04400101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt04400101) parserImpl.read(MxTsmt04400101 .class, xml, _classes));
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
     * Creates an MxTsmt04400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt04400101 message
     * @return
     *     a new instance of MxTsmt04400101
     */
    public final static MxTsmt04400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt04400101 .class);
    }

}
