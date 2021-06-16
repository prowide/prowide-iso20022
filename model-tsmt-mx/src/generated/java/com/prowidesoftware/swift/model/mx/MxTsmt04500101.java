
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for tsmt.045.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fwdInttToPayNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.045.001.01")
public class MxTsmt04500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FwdInttToPayNtfctn", required = true)
    protected ForwardIntentToPayNotificationV01 fwdInttToPayNtfctn;
    public final static transient String BUSINESS_PROCESS = "tsmt";
    public final static transient int FUNCTIONALITY = 45;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, Action2Code.class, Adjustment4 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, BICIdentification1 .class, BaselineStatus3Code.class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CurrencyAndAmount.class, DocumentIdentification3 .class, DocumentIdentification5 .class, DocumentIdentification7 .class, FinancialInstitutionIdentification4Choice.class, ForwardIntentToPayNotificationV01 .class, IntentToPay1 .class, InvoiceIdentification1 .class, MessageIdentification1 .class, MxTsmt04500101 .class, NameAndAddress6 .class, PendingActivity2 .class, PostalAddress2 .class, ReportLine2 .class, ReportLine3 .class, ReportLine4 .class, SettlementTerms2 .class, SimpleIdentificationInformation.class, SimpleIdentificationInformation2 .class, TransactionStatus4 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:tsmt.045.001.01";

    public MxTsmt04500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTsmt04500101(final String xml) {
        this();
        MxTsmt04500101 tmp = parse(xml);
        fwdInttToPayNtfctn = tmp.getFwdInttToPayNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTsmt04500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the fwdInttToPayNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardIntentToPayNotificationV01 }
     *     
     */
    public ForwardIntentToPayNotificationV01 getFwdInttToPayNtfctn() {
        return fwdInttToPayNtfctn;
    }

    /**
     * Sets the value of the fwdInttToPayNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardIntentToPayNotificationV01 }
     *     
     */
    public MxTsmt04500101 setFwdInttToPayNtfctn(ForwardIntentToPayNotificationV01 value) {
        this.fwdInttToPayNtfctn = value;
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
    public static MxTsmt04500101 parse(String xml) {
        return ((MxTsmt04500101) MxReadImpl.parse(MxTsmt04500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTsmt04500101 parse(String xml, MxRead parserImpl) {
        return ((MxTsmt04500101) parserImpl.read(MxTsmt04500101 .class, xml, _classes));
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
     * Creates an MxTsmt04500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTsmt04500101 message
     * @return
     *     a new instance of MxTsmt04500101
     */
    public final static MxTsmt04500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxTsmt04500101 .class);
    }

}
