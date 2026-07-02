
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.057.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ntfctnToRcv"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.057.001.02")
public class MxCamt05700102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "NtfctnToRcv", required = true)
    protected NotificationToReceiveV02 ntfctnToRcv;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 57;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountNotification4 .class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification4 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount16 .class, CashAccountType2 .class, CashAccountType4Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader43 .class, MxCamt05700102 .class, NameAndAddress10 .class, NamePrefix1Code.class, NotificationItem3 .class, NotificationToReceiveV02 .class, OrganisationIdentification4 .class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, Party12Choice.class, Party6Choice.class, Party7Choice.class, PartyIdentification32 .class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount1 .class, RemittanceInformation6 .class, RemittanceLocation2 .class, RemittanceLocationMethod2Code.class, StructuredRemittanceInformation8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.057.001.02";

    public MxCamt05700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt05700102(final String xml) {
        this();
        MxCamt05700102 tmp = parse(xml);
        ntfctnToRcv = tmp.getNtfctnToRcv();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt05700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ntfctnToRcv property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationToReceiveV02 }
     *     
     */
    public NotificationToReceiveV02 getNtfctnToRcv() {
        return ntfctnToRcv;
    }

    /**
     * Sets the value of the ntfctnToRcv property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationToReceiveV02 }
     *     
     */
    public MxCamt05700102 setNtfctnToRcv(NotificationToReceiveV02 value) {
        this.ntfctnToRcv = value;
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
    public static MxCamt05700102 parse(String xml) {
        return ((MxCamt05700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt05700102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt05700102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt05700102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt05700102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt05700102) parserImpl.read(MxCamt05700102 .class, xml, _classes));
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
     * Creates an MxCamt05700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt05700102 message
     * @return
     *     a new instance of MxCamt05700102
     */
    public final static MxCamt05700102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt05700102 .class);
    }

}
