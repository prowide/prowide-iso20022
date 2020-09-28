
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
 * Class for pacs.003.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00300101"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.003.001.01")
public class MxPacs00300101
    extends AbstractMX
{

    @XmlElement(name = "pacs.003.001.01", required = true)
    protected Pacs00300101 pacs00300101;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AddressType2Code.class, AmendmentInformationDetails1 .class, BranchAndFinancialInstitutionIdentification3 .class, BranchData.class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CashClearingSystem3Code.class, ChargeBearerType1Code.class, ChargesInformation1 .class, ClearingChannel2Code.class, ClearingSystemIdentification1Choice.class, ClearingSystemMemberIdentification3Choice.class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DirectDebitTransaction1 .class, DirectDebitTransactionInformation2 .class, DocumentType2Code.class, DocumentType3Code.class, FinancialInstitutionIdentification3 .class, FinancialInstitutionIdentification5Choice.class, Frequency1Code.class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader3 .class, LocalInstrument1Choice.class, MandateRelatedInformation1 .class, MxPacs00300101 .class, NameAndAddress3 .class, NameAndAddress7 .class, OrganisationIdentification2 .class, Pacs00300101 .class, Party2Choice.class, PartyIdentification8 .class, PaymentCategoryPurpose1Code.class, PaymentIdentification2 .class, PaymentTypeInformation4 .class, PersonIdentification3 .class, PostalAddress1 .class, Priority2Code.class, Purpose1Choice.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RegulatoryAuthority.class, RegulatoryReporting2 .class, RegulatoryReportingType1Code.class, RemittanceInformation1 .class, RemittanceLocation1 .class, RemittanceLocationMethod1Code.class, SequenceType1Code.class, ServiceLevel2Code.class, ServiceLevel3Choice.class, SettlementInformation2 .class, SettlementMethod2Code.class, SimpleIdentificationInformation2 .class, StructuredRegulatoryReporting2 .class, StructuredRemittanceInformation6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.003.001.01";

    public MxPacs00300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00300101(final String xml) {
        this();
        MxPacs00300101 tmp = parse(xml);
        pacs00300101 = tmp.getPacs00300101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00300101 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00300101 }
     *     
     */
    public Pacs00300101 getPacs00300101() {
        return pacs00300101;
    }

    /**
     * Sets the value of the pacs00300101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00300101 }
     *     
     */
    public MxPacs00300101 setPacs00300101(Pacs00300101 value) {
        this.pacs00300101 = value;
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
    public static MxPacs00300101 parse(String xml) {
        return ((MxPacs00300101) MxReadImpl.parse(MxPacs00300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00300101 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00300101) parserImpl.read(MxPacs00300101 .class, xml, _classes));
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
     * Creates an MxPacs00300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00300101 message
     * @return
     *     a new instance of MxPacs00300101
     */
    public final static MxPacs00300101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxPacs00300101 .class);
    }

}
