
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
 * Class for camt.007.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt00700201"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.007.002.01")
public class MxCamt00700201
    extends AbstractMX
{

    @XmlElement(name = "camt.007.002.01", required = true)
    protected Camt00700201 camt00700201;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1Choice.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification.class, BranchData.class, Camt00700201 .class, Case.class, CaseAssignment.class, CashAccount3 .class, CashAccountType3Code.class, CashClearingSystem2Code.class, ChargeBearer1Code.class, ClearingSystemMemberIdentificationChoice.class, CurrencyAndAmount.class, DocumentType1Code.class, FinancialInstitutionIdentification1 .class, GenericIdentification3 .class, GenericIdentification4 .class, Instruction1Code.class, Instruction3Code.class, InstructionForFinalAgent.class, MxCamt00700201 .class, NonFinancialInstitutionIdentification1 .class, Party1Choice.class, PartyIdentification1 .class, PaymentInstructionExtract.class, PaymentPurpose1Code.class, PaymentSchemeChoice.class, PersonIdentification2 .class, PostalAddress1 .class, PurposeChoice.class, ReferredDocumentAmount1Choice.class, RemittanceInformation3Choice.class, RequestedModification.class, SWIFTServiceLevel2Code.class, SimpleIdentificationInformation.class, StructuredRemittanceInformation2 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.007.002.01";

    public MxCamt00700201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00700201(final String xml) {
        this();
        MxCamt00700201 tmp = parse(xml);
        camt00700201 = tmp.getCamt00700201();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00700201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt00700201 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt00700201 }
     *     
     */
    public Camt00700201 getCamt00700201() {
        return camt00700201;
    }

    /**
     * Sets the value of the camt00700201 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt00700201 }
     *     
     */
    public MxCamt00700201 setCamt00700201(Camt00700201 value) {
        this.camt00700201 = value;
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
    public static MxCamt00700201 parse(String xml) {
        return ((MxCamt00700201) MxReadImpl.parse(MxCamt00700201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00700201 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00700201) parserImpl.read(MxCamt00700201 .class, xml, _classes));
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
     * Creates an MxCamt00700201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00700201 message
     * @return
     *     a new instance of MxCamt00700201
     */
    public final static MxCamt00700201 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt00700201 .class);
    }

}
