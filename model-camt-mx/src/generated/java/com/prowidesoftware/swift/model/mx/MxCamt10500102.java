
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
 * Class for camt.105.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "chrgsPmtNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.105.001.02")
public class MxCamt10500102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ChrgsPmtNtfctn", required = true)
    protected ChargesPaymentNotificationV02 chrgsPmtNtfctn;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 105;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, ChargeType3Choice.class, Charges4Choice.class, ChargesBreakdown1 .class, ChargesPaymentNotificationV02 .class, ChargesPerTransaction4 .class, ChargesPerTransactionRecord4 .class, ChargesPerType4 .class, ChargesPerTypeRecord4 .class, ChargesRecord10 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification3 .class, GenericIdentification30 .class, GroupHeader126 .class, InstructionForInstructedAgent1 .class, MxCamt10500102 .class, PostalAddress27 .class, ProprietaryReference1 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TotalCharges7 .class, TotalCharges8 .class, TransactionReferences7 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.105.001.02";

    public MxCamt10500102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt10500102(final String xml) {
        this();
        MxCamt10500102 tmp = parse(xml);
        chrgsPmtNtfctn = tmp.getChrgsPmtNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt10500102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the chrgsPmtNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesPaymentNotificationV02 }
     *     
     */
    public ChargesPaymentNotificationV02 getChrgsPmtNtfctn() {
        return chrgsPmtNtfctn;
    }

    /**
     * Sets the value of the chrgsPmtNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesPaymentNotificationV02 }
     *     
     */
    public MxCamt10500102 setChrgsPmtNtfctn(ChargesPaymentNotificationV02 value) {
        this.chrgsPmtNtfctn = value;
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
    public static MxCamt10500102 parse(String xml) {
        return ((MxCamt10500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt10500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt10500102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt10500102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt10500102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt10500102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt10500102) parserImpl.read(MxCamt10500102 .class, xml, _classes));
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
     * Creates an MxCamt10500102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt10500102 message
     * @return
     *     a new instance of MxCamt10500102
     */
    public static final MxCamt10500102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt10500102 .class);
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
