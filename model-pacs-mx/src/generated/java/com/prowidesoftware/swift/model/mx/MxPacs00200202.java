
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
 * Class for pacs.002.002.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00200202"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:pacs.002.002.02")
public class MxPacs00200202
    extends AbstractMX
{

    @XmlElement(name = "pacs.002.002.02", required = true)
    protected Pacs00200202 pacs00200202;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2 .class, AccountIdentification3Choice.class, AddressType2Code.class, AmendmentInformationDetails4 .class, CashAccount10 .class, CashAccount8 .class, CashClearingSystem3Code.class, ClearingSystemIdentification1Choice.class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EuroMax9Amount.class, FinancialInstitution2 .class, FinancialInstitution3 .class, FinancialInstitutionIdentification4 .class, FinancialInstitutionIdentification5 .class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader12 .class, MandateRelatedInformation4 .class, MxPacs00200202 .class, OrganisationIdentification2 .class, OrganisationIdentification3 .class, OriginalGroupInformation13 .class, OriginalTransactionReference8 .class, Pacs00200202 .class, Party2Choice.class, Party5Choice.class, PartyIdentification11 .class, PartyIdentification12 .class, PartyIdentification14 .class, PartyIdentification17 .class, PartyIdentification19 .class, PartyIdentification8 .class, PartyOrganisation1Choice.class, PartyPrivate1 .class, PaymentTransactionInformation12 .class, PaymentTypeInformation9 .class, PersonIdentification3 .class, PersonIdentification4 .class, PostalAddress1 .class, PostalAddress4 .class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation3 .class, RestrictedIdentification1 .class, RestrictedIdentification2 .class, SequenceType1Code.class, ServiceLevel3Code.class, ServiceLevel4 .class, SettlementInformation10 .class, SettlementMethod2Code.class, SimpleIdentificationInformation2 .class, StatusReason3Choice.class, StatusReasonInformation4 .class, StructuredRemittanceInformation6 .class, TransactionGroupStatus2Code.class, TransactionIndividualStatus2Code.class, TransactionRejectReason4Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:pacs.002.002.02";

    public MxPacs00200202() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00200202(final String xml) {
        this();
        MxPacs00200202 tmp = parse(xml);
        pacs00200202 = tmp.getPacs00200202();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00200202(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00200202 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00200202 }
     *     
     */
    public Pacs00200202 getPacs00200202() {
        return pacs00200202;
    }

    /**
     * Sets the value of the pacs00200202 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00200202 }
     *     
     */
    public MxPacs00200202 setPacs00200202(Pacs00200202 value) {
        this.pacs00200202 = value;
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
    public static MxPacs00200202 parse(String xml) {
        return ((MxPacs00200202) MxReadImpl.parse(MxPacs00200202 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00200202 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00200202) parserImpl.read(MxPacs00200202 .class, xml, _classes));
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
     * Creates an MxPacs00200202 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00200202 message
     * @return
     *     a new instance of MxPacs00200202
     */
    public final static MxPacs00200202 fromJson(String json) {
        return AbstractMX.fromJson(json, MxPacs00200202 .class);
    }

}
