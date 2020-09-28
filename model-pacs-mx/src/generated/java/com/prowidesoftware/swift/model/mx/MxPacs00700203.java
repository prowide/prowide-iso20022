
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
 * Class for pacs.007.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00700203"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:pacs.007.002.03")
public class MxPacs00700203
    extends AbstractMX
{

    @XmlElement(name = "pacs.007.002.03", required = true)
    protected Pacs00700203 pacs00700203;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification2 .class, AccountIdentification3Choice.class, AddressType2Code.class, AmendmentInformationDetails4 .class, CashAccount10 .class, CashAccount8 .class, CashClearingSystem3Code.class, ChargeBearerType2Code.class, ClearingSystemIdentification1Choice.class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EuroMax15Amount.class, EuroMax9Amount.class, FinancialInstitution2 .class, FinancialInstitution3 .class, FinancialInstitutionIdentification4 .class, FinancialInstitutionIdentification5 .class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader28 .class, LocalInstrument1 .class, MandateRelatedInformation4 .class, MxPacs00700203 .class, OrganisationIdentification2 .class, OrganisationIdentification3 .class, OriginalGroupInformation14 .class, OriginalTransactionReference10 .class, Pacs00700203 .class, Party2Choice.class, Party5Choice.class, PartyIdentification11 .class, PartyIdentification14 .class, PartyIdentification17 .class, PartyIdentification19 .class, PartyIdentification30 .class, PartyIdentification8 .class, PartyOrganisation1Choice.class, PartyPrivate1 .class, PaymentCategoryPurpose1Code.class, PaymentTransactionInformation20 .class, PaymentTypeInformation15 .class, PersonIdentification3 .class, PersonIdentification4 .class, PostalAddress1 .class, PostalAddress4 .class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RemittanceInformation3 .class, RestrictedIdentification1 .class, RestrictedIdentification2 .class, ReversalReason3Choice.class, ReversalReasonInformation4 .class, SequenceType1Code.class, ServiceLevel3Code.class, ServiceLevel4 .class, SettlementInformation10 .class, SettlementInformation11 .class, SettlementMethod2Code.class, SimpleIdentificationInformation2 .class, StructuredRemittanceInformation6 .class, TransactionReversalReason2Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:pacs.007.002.03";

    public MxPacs00700203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00700203(final String xml) {
        this();
        MxPacs00700203 tmp = parse(xml);
        pacs00700203 = tmp.getPacs00700203();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00700203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00700203 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00700203 }
     *     
     */
    public Pacs00700203 getPacs00700203() {
        return pacs00700203;
    }

    /**
     * Sets the value of the pacs00700203 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00700203 }
     *     
     */
    public MxPacs00700203 setPacs00700203(Pacs00700203 value) {
        this.pacs00700203 = value;
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
    public static MxPacs00700203 parse(String xml) {
        return ((MxPacs00700203) MxReadImpl.parse(MxPacs00700203 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00700203 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00700203) parserImpl.read(MxPacs00700203 .class, xml, _classes));
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
     * Creates an MxPacs00700203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00700203 message
     * @return
     *     a new instance of MxPacs00700203
     */
    public final static MxPacs00700203 fromJson(String json) {
        return AbstractMX.fromJson(json, MxPacs00700203 .class);
    }

}
