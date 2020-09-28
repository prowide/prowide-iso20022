
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
 * Class for camt.028.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "camt02800102"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.028.001.02")
public class MxCamt02800102
    extends AbstractMX
{

    @XmlElement(name = "camt.028.001.02", required = true)
    protected Camt02800102 camt02800102;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 28;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account1 .class, AccountIdentification1 .class, AccountIdentification1Choice.class, AddressType2Code.class, AmountType1Choice.class, BranchAndFinancialInstitutionIdentification.class, BranchData.class, Camt02800102 .class, Case.class, CaseAssignment.class, CashAccount3 .class, CashAccountType3Code.class, ClearingSystemMemberIdentificationChoice.class, CurrencyAndAmount.class, DocumentType1Code.class, EquivalentAmount.class, FinancialInstitutionIdentification1 .class, GenericIdentification1 .class, GenericIdentification3 .class, GenericIdentification4 .class, Intermediary1 .class, LongPostalAddress1Choice.class, MxCamt02800102 .class, NameAndAddress2 .class, NonFinancialInstitutionIdentification1 .class, Party1Choice.class, PartyIdentification1 .class, PartyIdentification1Choice.class, PaymentComplementaryInformation.class, PaymentInstructionExtract2 .class, PersonIdentification2 .class, PostalAddress1 .class, ReferredDocumentAmount1Choice.class, RemittanceInformation3Choice.class, SimpleIdentificationInformation.class, StructuredLongPostalAddress1 .class, StructuredRemittanceInformation2 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.028.001.02";

    public MxCamt02800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02800102(final String xml) {
        this();
        MxCamt02800102 tmp = parse(xml);
        camt02800102 = tmp.getCamt02800102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the camt02800102 property.
     * 
     * @return
     *     possible object is
     *     {@link Camt02800102 }
     *     
     */
    public Camt02800102 getCamt02800102() {
        return camt02800102;
    }

    /**
     * Sets the value of the camt02800102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camt02800102 }
     *     
     */
    public MxCamt02800102 setCamt02800102(Camt02800102 value) {
        this.camt02800102 = value;
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
    public static MxCamt02800102 parse(String xml) {
        return ((MxCamt02800102) MxReadImpl.parse(MxCamt02800102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02800102 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02800102) parserImpl.read(MxCamt02800102 .class, xml, _classes));
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
     * Creates an MxCamt02800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02800102 message
     * @return
     *     a new instance of MxCamt02800102
     */
    public final static MxCamt02800102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt02800102 .class);
    }

}
